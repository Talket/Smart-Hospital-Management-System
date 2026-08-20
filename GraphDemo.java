import java.util.*;

public class GraphDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> g = new HashMap<>();

        System.out.print("Enter number of connecting hallways: ");
        int edges = Integer.parseInt(sc.nextLine());

        System.out.println("Enter paths one by one (Format: Dept1 Dept2):");
        for (int i = 0; i < edges; i++) {
            String u = sc.next();
            String v = sc.next();
            
            g.putIfAbsent(u, new ArrayList<>());
            g.putIfAbsent(v, new ArrayList<>());
            g.get(u).add(v);
            g.get(v).add(u);
        }
        sc.nextLine(); 

        System.out.print("\nEnter your current Department: ");
        String start = sc.nextLine();

        System.out.print("Enter destination Department: ");
        String target = sc.nextLine();

        if (!g.containsKey(start) || !g.containsKey(target)) {
            System.out.println("Invalid departments entered.");
        } else {
            Queue<String> q = new LinkedList<>();
            Map<String, String> p = new HashMap<>();
            Set<String> vis = new HashSet<>();
            
            q.add(start); 
            vis.add(start);
            boolean found = false;
            
            while (!q.isEmpty()) {
                String curr = q.poll();
                
                if (curr.equals(target)) { 
                    found = true; 
                    break; 
                }
                
                for (String nxt : g.get(curr)) {
                    if (!vis.contains(nxt)) {
                        vis.add(nxt);
                        p.put(nxt, curr);
                        q.add(nxt);
                    }
                }
            }
            
            if (found) {
                List<String> ans = new ArrayList<>();
                String temp = target;
                
                while (temp != null) {
                    ans.add(temp);
                    temp = p.get(temp);
                }
                
                Collections.reverse(ans);
                System.out.println("\nShortest Navigation Path:");
                System.out.println(String.join(" -> ", ans));
            } else {
                System.out.println("\nNo path found between " + start + " and " + target + ".");
            }
        }
        
        sc.close();
    }
}
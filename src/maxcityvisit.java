import java.util.HashMap;
import java.util.HashSet;

public class maxcityvisit {
    int city, busRoute;
    int[][] routes;

    public maxcityvisit(int city, int buses, int[][] routes) {
        this.city = city;
        this.busRoute = buses;
        this.routes = routes;
    }

    public int maxcitys() {
        HashMap<Integer, HashSet<Integer>> routeMapping = new HashMap<>();
        HashSet<Integer> addedRoutes = new HashSet<>();
        int max = 0;
        while (busRoute > 0) {
            int current_max = 1;
            int a = routes[busRoute - 1][0], b = routes[busRoute - 1][1];
            if (routeMapping.containsKey(a)) {
                routeMapping.get(a).add(b);
                addedRoutes.add(b);
                current_max = routeMapping.get(a).size();
            } else if (routeMapping.containsKey(b)) {
                routeMapping.get(b).add(a);
                addedRoutes.add(a);
                current_max = routeMapping.get(b).size();
            } else {
                if (addedRoutes.contains(a) || addedRoutes.contains(b)) {
                    current_max = addToRoute(routeMapping, a, b);
                } else {
                    if (a != b) {
                        routeMapping.computeIfAbsent(a, l -> new HashSet<>()).add(b);
                    }
                    current_max = routeMapping.get(a).size();
                }
                addedRoutes.add(a);
                addedRoutes.add(b);
            }
            max = Math.max(current_max, max);
            busRoute--;
        }
        return max + 1;
    }

    private int addToRoute(HashMap<Integer, HashSet<Integer>> routeMapping, int a, int b) {
        for (Integer k :
                routeMapping.keySet()) {
            if (routeMapping.get(k).contains(a)) {
                routeMapping.get(k).add(b);
                return routeMapping.get(k).size();
            } else if (routeMapping.get(k).contains(b)) {
                routeMapping.get(k).add(a);
                return routeMapping.get(k).size();
            }
        }
        return -1;
    }
}

import java.util.*;

class WebPageClicks {

    static class Graph {
        private int numPages;
        private Map<Integer, List<Integer>> links;

        public Graph(int numPages) {
            this.numPages = numPages;
            this.links = new HashMap<>();
        }

        public void addLink(int fromPage, int toPage) {
            if (!links.containsKey(fromPage)) {
                links.put(fromPage, new ArrayList<>());
            }
            links.get(fromPage).add(toPage);
        }

        public int minClicks(int start, int end) {
            Queue<Integer> queue = new LinkedList<>();
            Map<Integer, Integer> clicks = new HashMap<>();
            Set<Integer> visited = new HashSet<>();

            queue.offer(start);
            clicks.put(start, 0);
            visited.add(start);

            while (!queue.isEmpty()) {
                int currentPage = queue.poll();

                if (currentPage == end) {
                    return clicks.get(currentPage);
                }

                if (links.containsKey(currentPage)) {
                    for (int nextPage : links.get(currentPage)) {
                        if (!visited.contains(nextPage)) {
                            queue.offer(nextPage);
                            clicks.put(nextPage, clicks.get(currentPage) + 1);
                            visited.add(nextPage);
                        }
                    }
                }
            }

            return -1; // If the end page cannot be reached
        }
    }

    public static void main(String[] args) {
        // Example input
        int numPages = 6;
        Graph graph = new Graph(numPages);
        graph.addLink(1, 2);
        graph.addLink(2, 3);
        graph.addLink(2, 4);
        graph.addLink(3, 5);
        graph.addLink(4, 5);
        graph.addLink(5, 6);

        int startPage = 1;
        int endPage = 6;

        int result = graph.minClicks(startPage, endPage);
        System.out.println("Minimum clicks required: " + result);
    }
}

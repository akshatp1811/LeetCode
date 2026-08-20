class Solution {
    public int openLock(String[] deadends, String target) {

        Set<String> dead = new HashSet<>(Arrays.asList(deadends));

        String start = "0000";

        if (dead.contains(start)) {
            return -1;
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();

        q.add(start);
        visited.add(start);

        int count = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int j = 0; j < size; j++) {

                String current = q.poll();

                if (current.equals(target)) {
                    return count;
                }

                for (int i = 0; i < 4; i++) {

                    // Scrolled Up
                    char[] arr = current.toCharArray();

                    if (arr[i] == '9') {
                        arr[i] = '0';
                    } else {
                        arr[i]++;
                    }

                    String next = new String(arr);

                    if (!dead.contains(next) && !visited.contains(next)) {
                        visited.add(next);
                        q.add(next);
                    }

                    // Scrolled Down
                    arr = current.toCharArray();

                    if (arr[i] == '0') {
                        arr[i] = '9';
                    } else {
                        arr[i]--;
                    }

                    String nextDown = new String(arr);

                    if (!dead.contains(nextDown) && !visited.contains(nextDown)) {
                        visited.add(nextDown);
                        q.add(nextDown);
                    }
                }
            }

            count++;
        }

        return -1;
    }
}
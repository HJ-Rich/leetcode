class Solution {
    public int[] getOrder(int[][] tasks) {
        final var answer = new int[tasks.length];

        final var taskQueue = createTaskQueue();
        for (int i = 0; i < tasks.length; i++) {
            taskQueue.add(new TaskInfo(i, tasks[i][0], tasks[i][1]));
        }
        
        final var processingQueue = createProcessingQueue();

        final var firstTask = taskQueue.poll();
        var currentTime = firstTask.enqueueTime + firstTask.processingTime;
        var index = 0;
        answer[index] = firstTask.index;
        index++;

        while (!taskQueue.isEmpty() || !processingQueue.isEmpty()) {
            if (!taskQueue.isEmpty()) {
                if (processingQueue.isEmpty() && taskQueue.peek().enqueueTime > currentTime) {
                    currentTime = taskQueue.peek().enqueueTime;
                }
                while (taskQueue.peek().enqueueTime <= currentTime) {
                    processingQueue.add(taskQueue.poll());
                    if (taskQueue.isEmpty()) {
                        break;
                    }
                }
            }

            final var task = processingQueue.poll();
            currentTime += task.processingTime;
            answer[index] = task.index;
            index++;
        }

        return answer;
    }

    class TaskInfo {
        public int index;
        public int enqueueTime;
        public int processingTime;

        public TaskInfo(final int index, final int enqueueTime, final int processingTime) {
            this.index = index;
            this.enqueueTime = enqueueTime;
            this.processingTime = processingTime;
        }
    }

    private PriorityQueue<TaskInfo> createTaskQueue() {
        final var taskQueueComparator = new Comparator<TaskInfo>(){
            @Override
            public int compare(TaskInfo o1, TaskInfo o2) {
                if (o1.enqueueTime < o2.enqueueTime) {
                    return -1;
                }

                if (o1.enqueueTime == o2.enqueueTime && o1.processingTime < o2.processingTime) {
                    return -1;
                }

                return 1;
            }
        };

        return new PriorityQueue<TaskInfo>(taskQueueComparator);
    }

    private PriorityQueue<TaskInfo> createProcessingQueue() {
        final var processingQueueComparator = new Comparator<TaskInfo>(){
            @Override
            public int compare(TaskInfo o1, TaskInfo o2) {
                if (o1.processingTime < o2.processingTime) {
                    return -1;
                }

                if (o1.processingTime == o2.processingTime && o1.index < o2.index) {
                    return -1;
                }

                return 1;
            }
        };

        return new PriorityQueue<TaskInfo>(processingQueueComparator);
    }
}
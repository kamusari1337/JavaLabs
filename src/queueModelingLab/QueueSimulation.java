package queueModelingLab;

public class QueueSimulation {
    public static void main(String[] args) {
        Queue queue = new Queue();
        double currentTime = 0;

        for (int i = 0; i < 1000; i++) {
            double arrivalTime = currentTime;
            double serviceTime = RandomGenerator.getRandomInRange(3, 5);
            Request request = new Request(i, arrivalTime, serviceTime);
            queue.addRequest(request);

            currentTime += RandomGenerator.getRandomInRange(1, 10);

            if (i % 100 == 0) {
                calculateSimulation(queue, i);
            }
        }
    }

    public static void calculateSimulation(Queue queue, int requestsCount) {
        int totalRequests = requestsCount;
        double totalTimeQueue = 0;

        for (int i = 0; i < 100; i++) {
            Request request = queue.pollRequest();
            if (request == null) {
                break;
            }

            totalRequests++;
            double timeInQueue = Math.max(request.getArriveTime(), request.getServiceTime())  - Math.min(request.getArriveTime(), request.getServiceTime());
            totalTimeQueue += timeInQueue;
        }

        double averageTimeInQueue = totalTimeQueue / totalRequests;

        System.out.printf("""
                Статистика после обслуживания %s заявок:
                Среднее время прибывания в очереди: %s
                """, requestsCount, averageTimeInQueue);
        }
}

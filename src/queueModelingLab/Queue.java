package queueModelingLab;

import java.util.LinkedList;

public class Queue {
    private LinkedList<Request> requests;

    public Queue() {
        requests = new LinkedList<>();
    }

    public void addRequest(Request request) {
        requests.addLast(request);
    }

    public Request pollRequest() {
        return requests.pollFirst();
    }

    public boolean isEmpty() {
        return requests.isEmpty();
    }

    public int size() {
        return requests.size();
    }
}

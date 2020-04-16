package ru.job4j.oop.collections.priority;

import java.util.LinkedList;
/**
 * 2. Очередь с приоритетом на LinkedList[#245002]
 * @author Kirill Asmanov
 * @since 05.04.2020
 * @version 1.0.0;
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (task.getPriority() >= element.getPriority()) {
                index++;
            } else {
                break;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Метод возвращает первый элемент из очереди, удаляя его
     * @return - первый элемент в очереди
     */
    public Task take() {
        return tasks.poll();
    }
}

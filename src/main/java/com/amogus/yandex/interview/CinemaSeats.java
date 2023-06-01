package com.amogus.yandex.interview;

/**
 * Места в кинотеатре расположены в один ряд. Только что пришедший зритель выбирает место,
 * чтобы сидеть максимально далеко от остальных зрителей в ряду.
 * То есть расстояние от того места, куда сядет зритель до ближайшего к нему зрителя
 * должно быть максимально.
 * ==
 * Гарантируется, что в ряду всегда есть свободные места и уже сидит хотя бы один зритель.
 * ==
 * Напишите функцию, которая по заданному ряду мест (массиву из нулей и единиц)
 * вернёт расстояние (ЧИСЛО ПОДЛОКОТНИКОВ) от выбранного места до ближайшего зрителя.
 * ==
 * findBestSeatDist([1, 0, 0, 0, 1]) -> 2
 * findBestSeatDist([1, 0, 1, 0, 0, 1, 0, 0, 0, 1]) -> 2
 * findBestSeatDist([1, 0, 1, 0]) -> 1
 * findBestSeatDist([1, 0, 0, 0, 0]) -> 4
 * findBestSeatDist([0, 0, 0, 0, 1]) -> 4
 */
public class CinemaSeats {
    public int findBestSeatDist(int[] seats) {
        int maxDistance = 0;
        int currentDistance = 0;
        boolean edgeCase = true;

        for (int seat : seats) {
            if (seat == 1) {
                if (edgeCase) {
                    maxDistance = currentDistance;
                    edgeCase = false;
                } else {
                    maxDistance = Math.max(maxDistance, (currentDistance + 1) / 2);
                    currentDistance = 0;
                }
            } else {
                currentDistance++;
            }
        }

        maxDistance = Math.max(maxDistance, currentDistance);
        return maxDistance;
    }
}

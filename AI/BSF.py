from queue import PriorityQueue

graph = {
    "A": [("B", 11), ("C", 14), ("D", 7)],
    "B": [("E", 15)],
    "C": [("E", 8), ("F", 10)],
    "D": [("F", 25)],
    "E": [("H", 9)],
    "F": [("G", 20)],
    "G": [],
    "H": [("G", 10)],
}

# Heuristic function (example: estimated distance from node to goal)

heuristic = {
    "A": 40,
    "B": 32,
    "C": 25,
    "D": 35,
    "E": 19,
    "F": 17,
    "H": 10,
    "G": 0,
}


def best_first_search(graph, start, goal, heuristic):
    visited = set()
    queue = PriorityQueue()
    queue.put((heuristic[start], start))
    while not queue.empty():
        _, current_node = queue.get()
        if current_node == goal:
            print("Goal reached:", goal)
            return
        if current_node not in visited:
            print("visiting node:", current_node)
            visited.add(current_node)
            for neighbour, cost in graph[current_node]:
                if neighbour not in visited:
                    queue.put((heuristic[neighbour], neighbour))
    print("Goal no reachable")
start_node = "A"
goal_node = "G"
best_first_search(graph, start_node, goal_node, heuristic)

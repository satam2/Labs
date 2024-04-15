from collections import defaultdict, deque

def canFinish(numCourses, prerequisites):
    graph = defaultdict(list)
    visited = [0] * numCourses  # 0 = unvisited, 1 = visiting, 2 = visited

    # build graph
    for dest, src in prerequisites:
        graph[src].append(dest)

    # DFS using stack to avoid recursion depth issues
    for i in range(numCourses):
        if visited[i] == 0:
            stack = [i]
            while stack:
                current = stack[-1]
                if visited[current] == 0:
                    visited[current] = 1  # mark as visiting
                elif visited[current] == 1:
                    visited[current] = 2  #add to visited list
                    stack.pop()
                    continue

                done = True
                for neighbor in graph[current]:
                    if visited[neighbor] == 1:
                        return False  # endless loop
                    if visited[neighbor] == 0:
                        stack.append(neighbor)
                        done = False
                        break

                if done:
                    visited[current] = 2  # visited
                    stack.pop()

    return True

# Example usage
# if __name__ == "__main__":
#     prerequisites = [[1, 0],[2,1],[3,2]]
#     numCourses = 4
#     print(canFinish(numCourses, prerequisites))  


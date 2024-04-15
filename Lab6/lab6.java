import java.util.*;

public class lab6 {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>(numCourses);
        int[] visited = new int[numCourses]; // 0 is unvisited, 1 is visiting, 2 is visited

        // initialize graph
        for(int i = 0; i<numCourses; i++){
            graph.add(new ArrayList<>());
        }

        // fill graph
        for(int[] prereqs: prerequisites){
            int course = prereqs[0];
            int prereq = prereqs[1];
            graph.get(prereq).add(course);
        }

        // DFS
        for(int i = 0; i<numCourses; i++){
            if(visited[i] == 0){
                Stack<Integer> stack = new Stack<>(); // make the stack
                stack.push(i); // push first node to stack
            

            while(!stack.isEmpty()){
                int curr = stack.peek(); // set current to top of stack

                if(visited[curr] == 0)  // if not visited, set to visiting
                    visited[curr] = 1;
                else if(visited[curr] == 1){ // if visiting, set to visited and remove from stack
                    visited[curr] = 2;
                    stack.pop();
                    continue;
                }
                
                boolean done = true; // done with first node
                for(int neighbor : graph.get(curr)){ // go to connecting node and check visited
                    if(visited[neighbor] == 1){ // endless loop
                        return false;
                    }

                    else if(visited[neighbor] == 0){ // next unvisited node
                        stack.push(neighbor);  // add node to stack
                        done = false;            
                        break;
                    }
                }

                if(done){
                    visited[curr] = 2;
                    stack.pop(); 
                }
            }
        }
    }
    
    return true;
}

    // public static void main(String[] args){
        // int[][] prereq = {{1,0},{2,1},{0,2}};
        // int[][] prereq = {{1,0},{0,1}};
        // int numCourses = 4;
        // lab6 test = new lab6();
        // System.out.println(test.canFinish(numCourses, prereq)); //false

    // }

}

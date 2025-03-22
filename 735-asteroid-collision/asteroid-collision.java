class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //Use Stack for what will be left 
        Stack<Integer> st = new Stack<>();

        //looping through the array 
        for (int i: asteroids){
            if (st.isEmpty()){
                st.push(i);
            }
            else{
                //if a positive an negetive astroid clash 

                while (true){
                    if ( !st.isEmpty() && ((st.peek() >0 && i<0))){
                        ///keep the heavier ast
                        if (Math.abs(i)>Math.abs(st.peek())){
                            st.pop();
                            // st.push(i);
                        }
                        //if they are equal delete it from list
                        else if (Math.abs(i)==Math.abs(st.peek())){
                            st.pop();
                            break;
                        }
                        //if its lighter dont add it to the list as it gets destroyed 
                        else {
                            break;
                        }
                    }
                    //add it to the list 
                    else {
                        st.push(i);
                        break;
                    }
                }
            }
        }

        //Creataing an array 
        int[] res = new int[st.size()];

        while(!st.isEmpty()){
            res[st.size()-1]=st.pop();
        }

        return res;
    }
}
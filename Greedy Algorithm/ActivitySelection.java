import java.util.*;

class ActivitySelection{

public static void main(String[] args){

Scanner s = new Scanner(System.in);

int n = s.nextInt();
int[] start = new int[n];
int[] finish = new int[n];

for(int i = 0; i <n; i ++){
start[i] = s.nextInt();
finish[i] = s.nextInt();
}

int currentS = start[0];
int currentF = finish[0];
System.out.println(0);

for(int i = 1; i < n; i ++){
if(start[i] >= currentF){
System.out.println(i);
currentS = start[i];
currentF = finish[i];
}
}

}


}



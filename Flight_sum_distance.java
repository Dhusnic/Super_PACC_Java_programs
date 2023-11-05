import java.util.Scanner;
public class Flight_sum_distance {
    public static void main(String[] args) {
        System.out.print("Enter the direction without space ");
        try (Scanner inp = new Scanner(System.in)) {
            String in=inp.next();
            int[] fi=new int[2];
            fi[0]=0;fi[1]=0;
            for(int i=0;i<in.length();i++)
            {
                char d= in.charAt(i);
                if(d=='N')
                {
                    fi[1]+=1;
                }
                else if(d=='S')
                {
                    fi[1]-=1;
                }
                else if(d=='E')
                {
                    fi[0]+=1;
                }
                else if(d=='W')
                {
                    fi[0]-=1;
                }

            }
            for(int i=0;i<2;i++)
            {
                System.out.print(fi[i]);
            }
            System.out.println("");
            if(fi[0]==0&&fi[1]==0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        
    }
}

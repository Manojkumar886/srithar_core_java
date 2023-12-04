package fundamentaljava;

import java.util.Arrays;

public class demoQueue
{
    public static void main(String[] args)
    {
        Line lines=new Line(10);
        lines.enqueue(7.8f);
        lines.enqueue(9.8f);
        lines.enqueue(11.8f);
        lines.enqueue(5.8f);
    }
}

    class Line
    {
        private float arr[];
        private int front=-1,rear=-1;
        public void enqueue(float data)
        {
            if(rear==-1)
            {
                System.out.println(("Queue is underlow\n"));
                rear++;
                arr[rear]=data;
                front=rear;
                System.out.println(data+" has enqueued"+rear+" end @"+front);
            }
            else if(front==arr.length-1)
            {
                System.out.println(" queue is overflow");
            }
            else
            {
                int dummy=front;
                while(dummy>=rear)
                {
                    arr[dummy+1]=arr[dummy];
                    dummy--;
                }
                arr[rear]=data;
                front++;
                System.out.println(data+" has enqueud "+rear+"end @"+front);
            }
            System.out.println(Arrays.toString(arr));
        }
        public Line(int size) {
            arr = new float[size];
        }
}

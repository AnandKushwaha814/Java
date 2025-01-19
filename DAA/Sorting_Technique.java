import java.util.*;
public class Sorting_Technique {
    public static void InsertionSort(int arr[]){
        int size=arr.length;
        for(int round = 1;round<size;round++){
            int value=arr[round];
            int j=round-1;
            for(;j>=0;j--){
                if(arr[j]>value){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=value;
        }
        System.out.println("Elements in the array are: ");
        for(int k=0;k<size;k++){
            System.out.print(arr[k]+ " ");
        }
    }
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int Partation(int arr[],int start,int end){
        int i=start-1;
        int pivat=arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivat){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    public static void QuickSort(int arr[],int start,int end){
        int size=end;
        if(start<end){
            int PivatIndex=Partation(arr,start,end);
            QuickSort(arr,start,PivatIndex-1);
            QuickSort(arr,PivatIndex,end);
        }
    }
    public static void merge(int arr[],int start,int mid,int end){
        int n1=mid-start+1;
        int n2=end-mid;
        int leftArray[]=new int[n1];
        int rightArray[]=new int[n2];
        for(int i=0;i<n1;i++){
            leftArray[i]=arr[start+i];
        }
        for(int j=0;j<n2;j++){
            rightArray[j]=arr[mid+1+j];
        }
        int i=0,j=0;
        int k=start;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[],int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);
        }
        
    }
    public static void heapSort(int arr[]){
        
    }

    public static void main(String[] args) {
        int arr[]={23,2,3,4,89,0,6,1};
        int len=arr.length;
        System.out.println("Sorting Techniques : ");
        System.out.println("1. Inserion Sort");
        System.out.println("2. Quick Sort");
        System.out.println("3. Merge Sort");
        System.out.println("4. Heap Sort");
        System.out.println("5. Exit..");
        do {
            System.out.println("\nChoose your option:");
            Scanner obj=new Scanner(System.in);
            int choice=obj.nextInt();
            switch (choice) {
                case 1:
                System.out.println("\nSorting Using insertion Sort: ");
                InsertionSort(arr);
                    
                    break;
                case 2:
                
                QuickSort(arr,0,len-1);
                for(int i=0;i<len;i++){
                    System.out.print(arr[i]+" ");
                }

                break;
                case 3:
                // int len=arr.length;
                System.out.println("\nSorting Using Merge Sort: ");
                mergeSort(arr,0,len-1);
                for(int i=0;i<len;i++){
                    System.out.print(arr[i]+" ");
                }
                break;
                case 4:
                break;
                case 5:
                System.exit(0);
                break;
            
                default:
                System.exit(0);
                    break;
            }
        //  System.out.println("\nDo you want to continue (Y/N):");
        //  cond=obj.next();
        //  String true_cond="Y";
        //   System.out.println(cond);

        //  if((cond!="Y"||cond!="y")){
            
        //  }
        } while (true);
        
        

    }
}
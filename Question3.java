class BinarySearch{  
    public static int binarySearch(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
            if (arr[mid] == key){  
            return mid;  
            }  
            if (arr[mid] > key){  
            return binarySearch(arr, first, mid-1, key);//search in left subarray  
            }else{  
            return binarySearch(arr, mid+1, last, key);//search in right subarray  
            }  
        }  
        return -1;  
    }  
    public static void main(String args[]){  
        int arr[] = {1,3,5,6};  
        int key = 5;  
        int last=arr.length-1;  
        int result = binarySearch(arr,0,last,key);  
        System.out.println(result);
    }  
}  
  
public class binarysearch {

    static int numlist[] = {1,1,2,3,6,78,90,90,95, 100, 110, 130, 150};
    public static void main(String args[]){
    System.out.println("searching for 78");
        System.out.println(binarysearch(78));
        System.out.println("Finished");
    }
    public static int binarysearch(int lookup){
        int low = 0;
        int high = numlist.length;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(numlist[mid] > lookup){
                high = mid + 1;
            }
            if(numlist[mid] < lookup) {
                low = mid - 1;
            }
                if(numlist[mid] < lookup){
                    return mid;
                }
                if(numlist[mid] == lookup){
                    return(mid);
            }
    }
        return - 1;}
}

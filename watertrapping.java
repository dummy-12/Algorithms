class Solution {
    public int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public int min(int a , int b){
        if(a<b){
            return a;
        }
        return b;
    }
    public int sum(int[] arr){
        int sum=0;
        for(int item:arr){
            sum+=item;
        }
        return sum;
    }
    public int trap(int[] height) {
        int[] maxr=new int[height.length];
        maxr[0]=height[0];
        for(int i=1;i<height.length;i++){
           maxr[i]=max(height[i],maxr[i-1]) ;
        }
        
        int[] maxl=new int[height.length];
        maxl[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            maxl[i]=max(height[i],maxl[i+1]);
        }
        int[] water=new int[height.length];
        for(int i=0;i<water.length;i++){
            water[i]=min(maxr[i],maxl[i])-height[i];
        }
        return sum(water);
        
        
        
    }
}
public class TrappingRainWater {
    public static int trappedRainwater(int [] array,int width){
        //Calculating Left Max boundary
        int [] leftMax = new int[array.length];
        leftMax[0] = array[0];
        for (int i = 1;i < array.length;i++){
            leftMax[i] = Math.max(array[i],leftMax[i - 1]);
        }
        //Calculating Right Max boundary
        int [] rightMax = new int[array.length];
        rightMax[array.length - 1] = array[array.length - 1];
        for (int i = array.length - 2; i >= 0;i--){
            rightMax[i] = Math.max(array[i],rightMax[i + 1]);
        }
        //Loop
        int trappedWater = 0;
        for (int i = 0; i < array.length;i++){
            //waterLevel = Math.min(leftMax[i],rightMax[i]) - array[i]
            trappedWater += (Math.min(leftMax[i],rightMax[i]) - array[i]) * width;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int [] height = {4, 2, 0, 6, 3, 2, 5};
        int width = 1;
        System.out.println("Trapped Rain water is: "+trappedRainwater(height,width));
    }
}

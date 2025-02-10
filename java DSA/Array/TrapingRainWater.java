public class TrapingRainWater {
    public static int trapRainW(int heigth[]) {
        int n = heigth.length;

        // calculate left max boundry array
        int leftmax[] = new int[n];
        leftmax[0] = heigth[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heigth[i], leftmax[i-1]);
        }

        // calculate right max boundry array
        int rigthMax[] = new int[n];
        rigthMax[n-1] = heigth[n-1];
        for (int i = n-2; i >= 0; i--) {
            rigthMax[i] = Math.max(heigth[i], rigthMax[i+1]);
        }

        int trapWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax boundry, right max boundry)
            int waterLev = Math.min(leftmax[i], rigthMax[i]);

            // trapped water = (water level - heigth[i])
            trapWater += waterLev - heigth[i];
        }
        return trapWater;

    }

    public static void main(String[] args) {
        int heigth[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trapRainW(heigth));
    }
}

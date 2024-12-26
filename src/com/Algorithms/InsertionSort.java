import com.Algorithms.AlgorithmData;

public class InsertionSort extends AlgorithmData {
   public InsertionSort(boolean isAscending, ArrayOrder_e intialArrayOrdering) {
      super.setAscending(isAscending);
      super.populateArray(intialArrayOrdering);
   }

   public void shellSort() {
      try {

         // Start with a big gap, then reduce the gap
         for (int sectionGap = SAMPLE_ARRAY_SIZE / 2; sectionGap > 0; sectionGap /= 2) {
            for (int iter = sectionGap; iter < SAMPLE_ARRAY_SIZE; iter += 1) {

               int temp = unsortedArray[iter];

               int shifted;
               if (isAscending) {
                  for (shifted = iter; shifted >= sectionGap
                        && unsortedArray[shifted - sectionGap] > temp; shifted -= sectionGap) {
                     unsortedArray[shifted] = unsortedArray[shifted - sectionGap];
                  }
               } else {
                  for (shifted = iter; shifted >= sectionGap
                        && unsortedArray[shifted - sectionGap] < temp; shifted -= sectionGap) {
                     unsortedArray[shifted] = unsortedArray[shifted - sectionGap];
                  }
               }

               unsortedArray[shifted] = temp;
               /* there are two outer loops, so dividing the time. */
               Thread.sleep(sortingSpeedWaitTime);
               waitTillResume();
               if (Thread.currentThread().isInterrupted()) {
                  return;
               }
            }
         }
      } catch (InterruptedException e) {
         Thread.currentThread().interrupt();
         e.printStackTrace(System.out);
         return;
      }

   }
}

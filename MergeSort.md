MergeSort 


We use left + (right - left) / 2 instead of (left + right) / 2 to prevent integer overflow. If left and right are large values, their sum can exceed the int range. The alternative formula computes the same midpoint but avoids adding two potentially large numbers together. This is the standard approach used in production code.

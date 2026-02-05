// 3379. Transformed Array
// given a circular array with positive and negative integers create an array based on the given condition if res[i] = i +- nums[i]

const nums = [-10,-10,-4];
const result = new Array(nums.length);

for(let i = 0; i<length;i++)
{
    if(nums[i]==0)
        result[i]=nums[i];
    else
        result[i]
}

// Notes
// Always ask 3 questions
// Where am I? → i
// How far do I move? → nums[i]
// What is the size? → n

// Shrink the move 
// Moving +n, +2n, +100n → no change
// Moving +k and +(k + n) → same final position
// Therefore, only the remainder matters.


 public boolean increasingTriplet(int[] nums) {
        int i = nums[0];
        int j = nums[0];
        for(int k = 1;k<nums.length;k++){
            if(i==j){
                if(i==nums[k]){
                    continue;
                }
                if(nums[k]>i){
                    j=nums[k];
                    continue;
                }
                if(nums[k]<i){
                    i = nums[k];
                    j = nums[k];
                }
            }
            else if(nums[k]>j){
                return true;
            }
            else if(nums[k]<j&&nums[k]>i){
               j = nums[k];
            }
            else if((nums[k]<j&&nums[k]<i)){
                for(int l = k+1;l<nums.length;l++){
                    if(nums[l]>j){
                        return true;
                    }
                }
                i = nums[k];
                j = nums[k];
            }
            else{
                continue;
            }
        }
        return false;
    }

class Solution {
		public int ls(int[] nums,int key) {
			
			for( int i=0;i<nums.length; ) {
				if(  nums[i]==key )
					return i;
				
			}   
			return -1 ;
		}
	}
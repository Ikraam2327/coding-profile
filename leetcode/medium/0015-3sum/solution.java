class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res=new ArrayList<>();
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            if(i>0&&a[i]==a[i-1]) continue;
            int l=i+1,r=n-1;
            while(l<r){
                int sum=a[i]+a[l]+a[r];
                if(sum==0){
                    res.add(Arrays.asList(a[i],a[l],a[r]));
                    while(l<r&&a[l]==a[l+1]) l++;
                    while(l<r&&a[r]==a[r-1]) r--;
                    l++;
                    r--;
                }
                else if(sum>0)
                r--;
                else
                l++;
            }
        }      return res;
    }
}
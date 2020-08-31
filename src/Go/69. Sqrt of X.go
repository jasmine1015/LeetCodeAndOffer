func mySqrt(x int) int {
        l := 0;
        r := x;
        for l < r {
            mid := (l + r + 1) >> 1;
            if(mid <= x/mid){
                l = mid;
            }else{
                r = mid -1;
            }
        }
        return r;
}
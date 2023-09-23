fun past(h: Int, m: Int, s: Int): Int {
    if(0 <= h && h <= 23 && 0 <= m && m <= 59 && 0 <= s && s <= 59){
        var mil = (h*3600+m*60+s)*1000
        return mil
    }
    else{
        return 0
    }
}

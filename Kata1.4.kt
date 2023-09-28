fun getMiddle(word : String) : String {
    if(word.length%2==0){
    var res = "${word[(word.length/2)-1]}${word[word.length/2]}"
    return res
    }
        return word[word.length/2].toString()
}

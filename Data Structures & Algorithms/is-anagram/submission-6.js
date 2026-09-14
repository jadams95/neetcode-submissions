class Solution {
    /**
     * @param {string} s
     * @param {string} t
     * @return {boolean}
     */
    isAnagram(s, t) {
        if(s.length != t.length){
            return false;
        }
        

        const countS = {};
        const countT = {};

        for(let i = 0; i < s.length; i++){
            countS[s[i]] = (countS[s[i]] || 0) + 1;
            countT[t[i]] = (countT[t[i]] || 0) + 1;
        }
        console.log(countS);
        console.log(countT);

        for(const key in countS){
            if(countS[key] !== countT[key]){
                return false;
            }
        }
        return true;


        // Map before for this one in Java 
        // const y = s.length;

        // for(let strIterator = 0; strIterator < y; strIterator){
        //     s.charAt()
        // }
    }
}

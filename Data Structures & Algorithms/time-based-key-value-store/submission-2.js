class TimeMap {
    constructor() {
        this.keyStore = new Map();
    }

    /**
     * @param {string} key
     * @param {string} value
     * @param {number} timestamp
     * @return {void}
     */
    set(key, value, timestamp) {

        if(!this.keyStore.has(key)){
            this.keyStore.set(key, []);
        }
        console.log(this.keyStore);
        // hashvalue of alice-happy with timestamp -> 1
        // return the value if the key and correct timestamp is used
        // if no timestamp value is stored then return no value stored
        // modular storage 1 2 3 
        this.keyStore.get(key).push([timestamp, value]);
        console.log(this.keyStore);

    }

    /**
     * @param {string} key
     * @param {number} timestamp
     * @return {string}
     */
    get(key, timestamp) {
        const values = this.keyStore.get(key) || [];
        let l = 0;
        let r = values.length - 1;
        let result = '';


        while(l <= r){
            const mid = Math.floor((l + r) / 2);
            // for loop though the key
            // the binary search is rather the value less than or equal to timestamp
            if(values[mid][0] <= timestamp){
                result = values[mid][1];
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return result;

    }
}

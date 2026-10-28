class Solution {
    removeVowels(s: string): string {
        return s.replace(/[aeiou]/g, "");
    }
}

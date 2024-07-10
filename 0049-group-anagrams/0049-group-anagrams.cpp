class Solution {
public:
    std::array<int,256> hash(string s){
        std::array<int,256> hash={0};
        for(int i=0;i<s.size();i++){
            hash[s[i]]++;
        }
        return hash;
    }
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<std::array<int,256>,vector<string>> map;
        for(auto str: strs){
            string s=str;
            sort(s.begin(),s.end());
            map[hash(str)].push_back(str);
        }
        vector<vector<string>> ans;
        for(auto it = map.begin(); it!= map.end();it++){
            ans.push_back(it->second);
        }
        return ans;
    }
};
# Documentation For Mahfil App & Coding Task 

## Folders
- [Manual Testing:](#manual-testing)  Folder containing testing files for Mahfil App
- [Coding:](#coding) Folder containing coding task part along with a txt file
- [Bug Photos:](#bug-photos) Folder containing the pictures/screenshots of the bug found while testing the App called Mahfil


## Software 
- [Xmind](https://xmind.app): For Mindmap Design for the app
- [Excel](): For writing test cases and other contents
- [Google Chrome](https://www.google.com/chrome): For testing and finding bugs. You can use any other web application.
- [IntelliJ IDEA](https://www.jetbrains.com/idea/download/?section=windows) For coding purpose. Download the community version for free use.

# Part 1: Manual Testing Part
## Contents
- [Mind Map](#mind-map)
- [Bug Reporting](#bug-reporting)
- [Test Case writing](#test-case-writing)
- [Bug Report](#bug-report)
- [Test Metrics](#test-metrics)


### Mind Map
There are modules and sub-modules inside the mindmap, which can also be called categories and sub-categories. The green boxes represent categories, the white boxes represent subcategories, and the yellow boxes represent nested subcategories.

![Daraz](https://github.com/rashadkhan97/Tast-Case-for-DARAZ/assets/76771109/045388d4-00ef-40b3-883c-c074e4d4290e)


### Report
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/73d0811e-b37d-4e50-a68b-60c549458b2b)
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/eff5dbfb-7c9c-49ac-83d5-df0e1c396690)



### Test Case Writing
Test case software was used to write a document: **Microsoft Excel**. 
<br>Here, **The total no of test cases written is - 42**  </br> **No of test case pass - 33** <br>**No of test cases failed - 9**. Also, some improvement details are given.</br>
<br> Check out these photos of test case writing --- </br>

![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/c504e51d-ce4e-4ae4-b267-3fca3e90e218)
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/20979c49-5628-45b7-8bbc-38646fe2dc97)
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/ac915af6-b30f-4fa5-857c-44439bd85dc1)
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/f45e7165-9af7-48b6-9310-3e47e84c8067)
![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/df27042f-3967-4b13-98d4-de064184e8f3)

### Bug Reporting
The number of bugs discovered in test case writing is concentrated in this section. As we already know from the previous section (Test Case Writing), 9 test cases failed. **#SL-11,13, 21, 22, 26, 30, 55, 64, 66** denotes the errors identified and written on those rows in the five bug reporting boxes below.

![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/1dcb0a2e-a087-4c37-b212-33611fb71a31)


### Test Metrics

![image](https://github.com/rashadkhan97/Mahfil---Steadfast-IT/assets/76771109/da54a512-53d2-4930-86c6-94d84da3b550)

# Part 2: Coding Part
## Content
Inside Coding folder there is one Folder and a Test file
- [Task Folder](#task-folder)
- [word.txt](#word.txt)

## Task folder: 
**Code file Location** - Coding/Task/src/WordCount.java

## Coding Overview:
### Importing Statements
import java.io.BufferedReader; <br />
import java.io.File; <br />
import java.io.FileReader; <br />
import java.util.*; <br />

**BufferedReader, File, FileReader:** Used for reading the file.

### Main Class and Method
public class WordCount { <br />
    public static void main(String[] args) throws Exception { <br />
        File file = new File("F:\\SQA FILE\\PROJECTS\\Internship Projects\\Mahfil - Steadfast IT\\Coding\\word.txt"); <br />
        BufferedReader reader = new BufferedReader(new FileReader(file)); <br />

**File:** Represents the file to be read <br />
**BufferedReader:** Reads the file line by line for efficient processing <br />

### Creating the Word Count Map using HashMap
 Map<String, Integer> map = new HashMap<>(); <br />
        String line; <br />

**map:** A HashMap to store words as keys and their counts as values. <br />
-**line:** A temporary variable to store each line read from the file. <br />

### Reading the File and Counting Words
 while ((line = reader.readLine()) != null) { <br />
            String[] words = line.split("\\W+"); <br />
            for (int i = 0; i < words.length; i++) { <br />
                String word = words[i]; <br />
                if (!word.isEmpty()) { <br />
                    word = word.toLowerCase(); <br />
                    int count = map.getOrDefault(word, 0); <br />
                    map.put(word, count + 1); <br />
                } <br />
            } <br />
        } <br />
        reader.close(); <br />

**while ((line = reader.readLine()) != null):** Reads each line from the file until the end. <br />
**line.split("\W+"):** Splits the line into words using a regular expression that matches non-word characters. <br />
**for (int i = 0; i < words.length; i++):** Iterates over each word in the line. <br />
**if (!word.isEmpty()):** Ensures empty strings are not processed. <br />
**word.toLowerCase():** Converts the word to lowercase to make the count case insensitive. <br />
**map.getOrDefault(word, 0):** Retrieves the current count of the word, or 0 if the word is not in the map. <br />
**map.put(word, count + 1):** Updates the count of the word in the map. <br />
**reader.close():** Closes the BufferedReader to release system resources. <br />

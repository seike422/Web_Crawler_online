import requests
from bs4 import BeautifulSoup

def read_file():
    file = open("theVerge.html")
    data = file.read()
    file.close()
    return data

soup = BeautifulSoup(read_file(),"lxml")
soup.prettify()


# Find out the number of 'h2' tags in the file
h2 = soup.find_all('h2')
occur = len(h2)
print(occur)


#Find the text content of the fifth 'span' tag
span = soup.find_all('span')
content = span[4].text
print(content)

#Find the number of 'a' tags that are the direct descendants of 'h2' tags
h2 = soup.find_all('h2')
m = 0
for i in h2:
    # call .findChildren() on each item in the h2 list
    children = i.findChildren("a")
    # Iterate over the list of children calling accessing the .text attribute on each child
    for child in children:
        what_i_want = child.text
        print(what_i_want)
        m = m+1

print(m)









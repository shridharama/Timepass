import re
import mechanize
br = mechanize.Browser()
br.open("http://rpsports.co.uk/duathlon2013/index.php")
#br.open("http://www.stackoverflow.com")
assert br.viewing_html()
#print br.info()
#print br.read()
br.select_form(name="form1")
br["bibno"] = "211"
response1 = br.submit()
print response1.read()
print response1.geturl()
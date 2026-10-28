
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('API/GET_User'))

// Verify HTTP status code
WS.verifyResponseStatusCode(response, 200)

// Verify user ID
WS.verifyElementPropertyValue(response, 'id', 1)

// Verify name is not empty
WS.verifyElementPropertyValue(response, 'name', 'Leanne Graham')

// Verify email is not empty
WS.verifyElementPropertyValue(response, 'email', 'Sincere@april.biz')

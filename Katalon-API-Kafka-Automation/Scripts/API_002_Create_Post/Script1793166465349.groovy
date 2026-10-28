
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

def response = WS.sendRequest(findTestObject('API/POST_Create_Post'))

// Verify HTTP status code
WS.verifyResponseStatusCode(response, 201)

// Verify response data
WS.verifyElementPropertyValue(response, 'title', 'Katalon API Test')
WS.verifyElementPropertyValue(response, 'body', 'Testing POST Request')
WS.verifyElementPropertyValue(response, 'userId', 1)

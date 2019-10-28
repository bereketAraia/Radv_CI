import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc3user14)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

'1041.1'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_Details'), 
    1)

'1041.2'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_Validate'), 
    1)

'1041.3'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_a_View Submission'), 
    2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_h1_Discrepant Confirmation'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Coversheet ID CY YYYY Contract'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_CHIC'), 2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_RRBHIC'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Enrollee ID 193470_92'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Name'), 2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Corrected Name'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_DOB'), 1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Corrected DOB'), 
    2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Provider Type PSHO'), 
    1)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Date of Service Start'), 
    1)

'1041.4'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_li_Date of Service End'), 
    2)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_h5_Filters'), 'Filters')

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_Submission Review'), 
    1)

'1041.5'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/button_Senior Evaluation'), 
    2)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_span_Timeline'), 
    1)

'1041.8'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_time_firstAction_p_AM'), 
    2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_FirstAction h3_timeline_text'), 
    1)

'1041.6'
WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_SecondAction_h3_timeline_textSubmission Review'), 
    1)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P6_Discrepant_Confirmation_Page/Discrepant_DETAILS_Tab/Text_strong_Submitted By_firstComment'), 
    1)


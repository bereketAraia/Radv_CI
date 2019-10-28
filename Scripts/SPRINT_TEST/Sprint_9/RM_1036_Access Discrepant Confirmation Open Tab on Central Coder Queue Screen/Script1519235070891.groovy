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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.mrrc2user51)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))

WebUI.delay(2)

WebUI.setText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_input_keyword'), 'xxxxxxxxxx')

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.delay(2)

'1036.4'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Text_p_No results found'), 
    'No results found')

WebUI.delay(2)

WebUI.clearText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_input_keyword'))

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/search_button_Search'))

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Text_ErrMsg_small_Please enter search criteria'), 
    'Please enter search criteria.')

//WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Coversheet ID'), 'COVERSHEET ID')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Submission Date'), 'SUBMISSION DATE')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Step'), 'STEP')

'1036.5'
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_More'), 'MORE')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Submission Review'), 
    'SUBMISSION REVIEW')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'), 
    'SENIOR EVALUATION')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'), 
    'INVALID CONFIRMATION')

'1036.6'
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Focused Review'), 'FOCUSED REVIEW')

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Submission Review'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

'1036.7'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Clear All'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Coversheet ID'))

WebUI.delay(3)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Submission Date'))

WebUI.delay(3)

'1036.9'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Step'))

WebUI.delay(3)

'1036.10'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))


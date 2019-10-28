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

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_In Escalation'))

'1038.2'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Completed'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/TAB_a_Open'))

WebUI.setText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/SearchBox_input_keyword'), 'xxxxxxxxxx')

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Search'))

'1038.4'
WebUI.verifyElementText(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Text_p_No results found'), 'No results found')

WebUI.clearText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/SearchBox_input_keyword'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Search'))

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Text_ErrMsg_small_Please enter search criteria'), 
    'Please enter search criteria.')

//WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Focused Review'))
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Coversheet ID'), 'COVERSHEET ID')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Submission Date'), 'SUBMISSION DATE')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Step'), 'STEP')

'1038.5'
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_More'), 'MORE')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Submission Review'), 'SUBMISSION REVIEW')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'), 'SENIOR EVALUATION')

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Invalid Confirmation'), 'INVALID CONFIRMATION')

'1038.6'
WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Focused Review'), 'FOCUSED REVIEW')

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Submission Review'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

'1038.7'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/button_Clear All'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Coversheet ID'))

WebUI.delay(3)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Submission Date'))

WebUI.delay(3)

'1038.9'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_th_Step'))

WebUI.delay(3)

'1038.10'
WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))




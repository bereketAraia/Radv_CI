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

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.verifyElementText(findTestObject('Old_Objects/Various_Objects_POPUPs/ViewFirst_Msg_h2_You must view the record be'), 'You must view the record before you can review this task.')

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_1/label_A CMS-Generated Attestat'))

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_1/label_A CMS-Generated Attestat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/a_View Submission'))

WebUI.delay(3)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Exit'))

WebUI.click(findTestObject('Old_Objects/Various_Objects_POPUPs/Popup_Exit_a_Dont Save'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.verifyElementText(findTestObject('Old_Objects/Various_Objects_POPUPs/ViewFirst_Msg_h2_You must view the record be'), 'You must view the record before you can review this task.')

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_1/label_A CMS-Generated Attestat'))

WebUI.delay(2)

WebUI.verifyElementNotClickable(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_1/label_A CMS-Generated Attestat'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/a_View Submission'))

WebUI.delay(3)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Exit'))

WebUI.click(findTestObject('Old_Objects/Various_Objects_POPUPs/Popup_Exit_button_Save'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.verifyElementNotPresent(findTestObject('Old_Objects/Various_Objects_POPUPs/ViewFirst_Msg_h2_You must view the record be'), 2)

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_1/label_A CMS-Generated Attestat'), 2)


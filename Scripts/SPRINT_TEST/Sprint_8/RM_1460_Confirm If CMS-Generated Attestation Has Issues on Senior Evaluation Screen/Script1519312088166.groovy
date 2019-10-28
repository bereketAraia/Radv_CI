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

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc3user50)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_dropDown_button_CY XXXX'))

WebUI.delay(3)

WebUI.click(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Hero/hero_button_CY 2015 Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/filter_button_Senior Evaluation'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P1_Central_Coder_Queue_Page/Table_first coversheet_a_Contract-Level RADV'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/button_Validate'))

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Detail_page/a_View Submission'))

WebUI.scrollToElement(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/h3_Select all relevant issues'), 
    2)

WebUI.verifyElementText(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/h4_Are there any issues with t'), 
    'Are there any issues with the CMS-generated Attestation?')

WebUI.delay(4)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Yes'), 2)

WebUI.verifyElementPresent(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_No'), 2)

WebUI.click(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Yes'))

WebUI.delay(3)

WebUI.verifyElementVisible(findTestObject('Old_Objects/INTAKE_P4_Ivalid_Confirmation_Page/Section_3/label_Attestation altered'))


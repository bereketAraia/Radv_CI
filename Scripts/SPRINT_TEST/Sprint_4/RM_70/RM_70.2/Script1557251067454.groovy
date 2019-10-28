import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.ApplicationURL)

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_username'), GlobalVariable.planuser16)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password'), GlobalVariable.password_plan_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(5, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_I accept.'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P2_Plan_Portal_Page/Contract_first_a_- Contract'))

WebUI.delay(2)

//---------------------- coversheet creating step---------------------------
WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P3_List_Enrollees_Page/Enrollee_1'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More'))

WebUI.delay(3)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/tr_1_td_8_More - Remove Coversheet'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('PLAN_PORTAL/PORTAL_NEW_P4_Enrollee_Sub_Mang_Page/Modal_removeCoversheet/p_Are you sure you want to remove this coversheet'), 
    'Are you sure you want to remove this coversheet? You will no longer have access to the coversheet or any associated attachments.')

WebUI.delay(2)


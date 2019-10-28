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

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/Input_Username_box'), GlobalVariable.mrrc2user9)

WebUI.setText(findTestObject('USER_Management/P0_Login_Page_Global/input_password (1)'), GlobalVariable.password_mrrc_QA)

WebUI.click(findTestObject('USER_Management/P0_Login_Page_Global/button_Log In_main'))

WebUI.delay(5)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_default_contract_CY YYYY Contract-Level'))

WebUI.delay(2)

WebUI.click(findTestObject('PLAN_PORTAL/PORTAL_NEW_P1_Accept_Page/button_CY 2015 Contract-Level'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_CMS_LOGO_img'), 0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_small_mrrc_X_ welcome to'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_strong_RADV CDAT CY YYYY'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Team Library'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_My Account'), 
    0)

WebUI.verifyElementPresent(findTestObject('CENTRAL_CODER/INTAKE_NEW_P1_Central_Coder_Queue_Page/Header_Tab_a_Log Out'), 
    0)

'header Varified'
WebUI.delay(2)

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_h1_Escalation Senior Coder Queue'), 
    'Escalation Senior Coder Queue')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_CurrentChoice_button_CY YYYY Contract-Level'), 
    'CY 2015 CONTRACT-LEVEL RADV')

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_CurrentChoice_button_CY YYYY Contract-Level'))

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_button_CY 2013 Contract-Level'), 
    'CY 2013 Contract-Level RADV')

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'), 
    2)

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'), 
    3)

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_In QA Panel (x)'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'), 
    3)

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'))

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Taba_Completed (x)'))

WebUI.delay(2)

WebUI.click(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Hero_Section/hero_Tab_a_Open (x)'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Escalation Case ID'), 
    'ESCALATION CASE ID')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Coversheet ID'), 
    'COVERSHEET ID')

WebUI.verifyElementPresent(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Date Escalated'), 
    0)

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_Step'), 
    'STEP')

WebUI.verifyElementText(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Table_Main_Section/th_More'), 
    'MORE')

WebUI.delay(4)

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_button_Request Escalation'))

WebUI.mouseOver(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_button_Request Escalation'))

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('ESCALATION/ESCALATION_Escalation_Senior_Coder_Queue_Page/Footer_Section/footer_a_Search all escalation cases'), 
    FailureHandling.CONTINUE_ON_FAILURE)


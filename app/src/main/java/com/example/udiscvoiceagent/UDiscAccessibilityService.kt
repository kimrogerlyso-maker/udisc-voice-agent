package com.example.udiscvoiceagent
 
import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.util.Log
 
class UDiscAccessibilityService : AccessibilityService() {
 
    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        Log.d("UDiscVoiceAgent", "Mottok event fra: ${event?.packageName}")
    }
 
    override fun onInterrupt() {
        Log.d("UDiscVoiceAgent", "Tjenesten ble avbrutt")
    }
}

package br.com.brunoti.cursos.alarmmanager

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import br.com.brunoti.cursos.sync.DrinkWaterReminderIntentService
import br.com.brunoti.cursos.sync.DrinkWaterReminderTask
import br.com.brunoti.cursos.utils.reminderUserToStretch

class StretchingBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        context?.let { reminderUserToStretch(it) }

        val myIntent = Intent(context, DrinkWaterReminderIntentService::class.java)
        myIntent.action = DrinkWaterReminderTask.ACTION_STRETCHING_REMINDER
        context?.startService(myIntent)
    }
}
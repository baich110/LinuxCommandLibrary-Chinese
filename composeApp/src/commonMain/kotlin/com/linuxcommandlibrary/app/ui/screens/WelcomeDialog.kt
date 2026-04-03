package com.linuxcommandlibrary.app.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.*
import androidx.compose.ui.semantics.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.text.style.*
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.linuxcommandlibrary.app.Strings

@Composable
fun WelcomeDialog(onAgree: () -> Unit, onLanguageSelected: (Strings.Language) -> Unit) {
    var selectedLanguage by remember { mutableStateOf(Strings.Language.CHINESE) }
    Dialog(
        onDismissRequest = { },
        properties = DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false, usePlatformDefaultWidth = false)
    ) {
        Card(modifier = Modifier.fillMaxWidth(0.92f).fillMaxHeight(0.88f), elevation = CardDefaults.cardElevation(defaultElevation = 16.dp), shape = RoundedCornerShape(24.dp)) {
            Column(modifier = Modifier.fillMaxSize().padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = Strings.WelcomeDialogStrings.title, style = MaterialTheme.typography.headlineSmall, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                Spacer(Modifier.height(4.dp))
                Text(text = Strings.WelcomeDialogStrings.subtitle, style = MaterialTheme.typography.bodyMedium, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.7f), textAlign = TextAlign.Center)
                Spacer(Modifier.height(20.dp))
                HorizontalDivider(color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12f))
                Spacer(Modifier.height(16.dp))
                Text(text = Strings.WelcomeDialogStrings.agreementTitle, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold, modifier = Modifier.align(Alignment.Start))
                Spacer(Modifier.height(12.dp))
                Box(modifier = Modifier.weight(1f).fillMaxWidth().border(1.dp, MaterialTheme.colorScheme.outline.copy(alpha = 0.3f), RoundedCornerShape(12.dp)).padding(12.dp).verticalScroll(rememberScrollState())) {
                    Text(text = Strings.WelcomeDialogStrings.agreementContent, style = MaterialTheme.typography.bodySmall, color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.8f))
                }
                Spacer(Modifier.height(16.dp))
                Text(text = Strings.WelcomeDialogStrings.selectLanguage, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold, modifier = Modifier.align(Alignment.Start))
                Spacer(Modifier.height(12.dp))
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                    LanguageOption(language = Strings.Language.CHINESE, isSelected = selectedLanguage == Strings.Language.CHINESE, onClick = { selectedLanguage = Strings.Language.CHINESE; Strings.setLanguage(Strings.Language.CHINESE) }, modifier = Modifier.weight(1f))
                    LanguageOption(language = Strings.Language.ENGLISH, isSelected = selectedLanguage == Strings.Language.ENGLISH, onClick = { selectedLanguage = Strings.Language.ENGLISH; Strings.setLanguage(Strings.Language.ENGLISH) }, modifier = Modifier.weight(1f))
                }
                Spacer(Modifier.height(20.dp))
                Button(onClick = { onLanguageSelected(selectedLanguage); onAgree() }, modifier = Modifier.fillMaxWidth().height(56.dp).pointerHoverIcon(PointerIcon.Hand), shape = RoundedCornerShape(16.dp), elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp), colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary, contentColor = Color.White)) {
                    Text(text = Strings.WelcomeDialogStrings.agreeAndContinue, style = MaterialTheme.typography.titleMedium, fontWeight = FontWeight.SemiBold)
                }
            }
        }
    }
}

@Composable
private fun LanguageOption(language: Strings.Language, isSelected: Boolean, onClick: () -> Unit, modifier: Modifier = Modifier) {
    val borderColor = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.outline.copy(alpha = 0.3f)
    val backgroundColor = if (isSelected) MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.3f) else Color.Transparent
    Box(modifier = modifier.height(64.dp).clip(RoundedCornerShape(12.dp)).border(if (isSelected) 2.dp else 1.dp, borderColor, RoundedCornerShape(12.dp)).background(backgroundColor).clickable(onClick = onClick).pointerHoverIcon(PointerIcon.Hand).semantics { contentDescription = language.displayName }, contentAlignment = Alignment.Center) {
        Text(text = language.displayName, style = MaterialTheme.typography.titleMedium, fontWeight = if (isSelected) FontWeight.Bold else FontWeight.Normal, color = if (isSelected) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface)
    }
}

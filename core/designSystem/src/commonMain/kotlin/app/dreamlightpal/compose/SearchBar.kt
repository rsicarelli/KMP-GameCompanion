package app.dreamlightpal.compose

//
//@Composable
//fun SearchBar(
//    modifier: Modifier = Modifier,
//    hint: String,
//    contentDescription: String,
//    saver: Saver<MutableState<TextFieldValue>, String> = Saver(
//        save = { it.value.text },
//        restore = { mutableStateOf(TextFieldValue(it)) }
//    ),
//    onTextChanged: (input: String) -> Unit,
//    onDone: (KeyboardActionScope.() -> Unit),
//) {
//    val textState = rememberSaveable(saver = saver) { mutableStateOf(TextFieldValue()) }
//
//    BasicTextField(
//        modifier = modifier
//            .background(
//                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.12F),
//                shape = CircleShape,
//            )
//            .padding(12.dp)
//            .fillMaxWidth(),
//        value = textState.value,
//        onValueChange = {
//            textState.value = it
//            onTextChanged(it.text)
//        },
//        singleLine = true,
//        keyboardOptions = KeyboardOptions(
//            autoCorrect = false,
//            imeAction = ImeAction.Done
//        ),
//        keyboardActions = KeyboardActions(onDone = onDone),
//        cursorBrush = SolidColor(MaterialTheme.colorScheme.primary),
//        textStyle = MaterialTheme.typography.bodyLarge,
//        decorationBox = { innerTextField ->
//            SearchDecorationBox(
//                contentDescription = contentDescription,
//                textState = textState.value,
//                hint = hint,
//                innerTextField = innerTextField
//            )
//        }
//    )
//}
//
//@Composable
//private fun SearchDecorationBox(
//    contentDescription: String,
//    textState: TextFieldValue,
//    hint: String,
//    innerTextField: @Composable () -> Unit,
//) {
//    Row(
//        verticalAlignment = Alignment.CenterVertically,
//        horizontalArrangement = Arrangement.spacedBy(8.dp)
//    ) {
//        Icon(
//            imageVector = Icons.Default.Search,
//            contentDescription = contentDescription,
//            tint = Color(0xFF3D4B6F)
//        )
//
//        if (textState.text.isEmpty()) {
//            Box(Modifier.weight(1f)) {
//                Text(
//                    text = hint,
//                    style = MaterialTheme.typography.bodyLarge,
//                    color = Color(0xFF3D4B6F)
//                )
//                innerTextField()
//            }
//        } else {
//            innerTextField()
//        }
//    }
//}

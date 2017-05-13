package com.esqtoesq.blackbeatles.esquiresame;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.Toast;


import com.esqtoesq.blackbeatles.esquiresame.demos.DemoMessages;
import com.esqtoesq.blackbeatles.esquiresame.fake.MessageFake;
import com.stfalcon.chatkit.messages.MessageInput;
import com.stfalcon.chatkit.messages.MessagesList;
import com.stfalcon.chatkit.messages.MessagesListAdapter;

public class MessagesActivity extends DemoMessages
        implements MessageInput.InputListener,
        MessageInput.AttachmentsListener {

    public static void open(Context context) {
        context.startActivity(new Intent(context, MessagesActivity.class));
    }

    private MessagesList messagesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_messages);
        this.messagesList = (MessagesList) findViewById(R.id.messagesList);
        initAdapter();
        MessageInput input = (MessageInput) findViewById(R.id.input);
        input.setInputListener(this);

    }
    @Override
    public void onBackPressed(){
        finish();
    }
    @Override
    public boolean onSubmit(CharSequence input) {
        super.messagesAdapter.addToStart(
                MessageFake.getTextMessage(input.toString()), true);
        return true;
    }
    @Override
    public void onAddAttachments() {
        super.messagesAdapter.addToStart(
                MessageFake.getImageMessage(), true);
    }

    private void initAdapter() {
        super.messagesAdapter = new MessagesListAdapter<>(super.senderId, super.imageLoader);
        super.messagesAdapter.enableSelectionMode(this);
        super.messagesAdapter.setLoadMoreListener(this);
        this.messagesList.setAdapter(super.messagesAdapter);
    }
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY){
        if(event2.getX() > event1.getX()){
            finish();
        }
        else if (event2.getX() < event1.getX()){
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Норм свапаешь!", Toast.LENGTH_SHORT);
            toast.show();
        }
        return true;

    }
}
# CN LAB

Socket programming experiments in C (TCP).

## Experiments

### Experiment 2 — Basic TCP Echo Client and Echo Server
- `exp2_server.c` — server receives a message from the client and echoes the same message back.
- `exp2_client.c` — client sends a message and prints the echoed message.

### Experiment 3 — TCP Echo Server until "Exit"
- `exp3_server.c` — server continuously receives messages and echoes them back until the client types **"Exit"**.
- `exp3_client.c` — client sends messages in a loop and exits after typing **"Exit"**.

### Experiment 4 — Chatting Application using TCP
- `exp4_server.c` — chat server (fork per client) that sends and receives messages until one side types **"bye"**.
- `exp4_client.c` — chat client that sends and receives messages until typing **"bye"**.

## Usage
Compile each program separately:

```bash
gcc exp2_server.c -o exp2_server
gcc exp2_client.c -o exp2_client
gcc exp3_server.c -o exp3_server
gcc exp3_client.c -o exp3_client
gcc exp4_server.c -o exp4_server
gcc exp4_client.c -o exp4_client
```

### Experiment 2
```bash
./exp2_server 8000          # terminal 1
./exp2_client localhost 8000 # terminal 2
```

### Experiment 3
```bash
./exp3_server 8000
./exp3_client localhost 8000
# type messages; type "Exit" to stop
```

### Experiment 4
```bash
./exp4_server               # prints the port; e.g. 54321
./exp4_client 54321
# type messages; type "bye" to end the chat
```

Note: server and client must run in separate terminals.
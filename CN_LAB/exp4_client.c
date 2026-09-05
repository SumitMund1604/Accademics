/* Name-Sumit Mund
   date-01-09-2026
   sic - 24bcsh05
*/

/* Experiment 4 : Develop a Chatting Application using TCP  --  CLIENT */

#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <signal.h>
#include <netinet/in.h>
#include <unistd.h>
#include <string.h>
#include <arpa/inet.h>

int main(int argc, char *argv[])
{
	int soc;
	char buf[1024], buf1[1024];
	struct sockaddr_in server;
	socklen_t addrlen = sizeof(server);

	if (argc < 2) {
		fprintf(stderr, "usage %s port\n", argv[0]);
		exit(1);
	}

	soc = socket(AF_INET, SOCK_STREAM, 0);
	if (soc < 0) {
		perror("Error opening socket");
		exit(1);
	}

	server.sin_family = AF_INET;
	server.sin_addr.s_addr = inet_addr("127.0.0.1");
	server.sin_port = htons(atoi(argv[1]));

	if (connect(soc, (struct sockaddr *) &server, sizeof(server)) < 0) {
		perror("Error in connection");
		exit(1);
	}

	do {
		printf("Client input: ");
		bzero(buf, 1024);
		fgets(buf, 1024, stdin);
		write(soc, buf, strlen(buf));

		bzero(buf1, 1024);
		read(soc, buf1, 1024);
		printf("Message from server: %s\n", buf1);
	} while (strncmp(buf, "bye", 3) != 0);

	close(soc);
	return 0;
}
